package C07ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//핵심 로직을 구현하는 계층
public class AuthorService {
    private AuthorRepository authorRepository;
    public AuthorService(){
        authorRepository = new AuthorRepository();
    }
    public void register(String name, String email, String password){
        Optional<Author> author = authorRepository.findByEmail(email);
        if(author.isPresent())throw new IllegalArgumentException("이메일 중복됩니다.");
        if(password.length() < 8)throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        this.authorRepository.register(new Author(name, email, password));
    }
    public void login(String email, String password){
        Author author = authorRepository.findByEmail(email).orElseThrow(()-> new NoSuchElementException("없는 이메일입니다."));
        if(!author.getPassword().equals(password)) {
            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
        }
    }
    public List<Author> findAll(){
        return this.authorRepository.findAll();
    }


}
