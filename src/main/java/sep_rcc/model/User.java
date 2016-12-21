package sep_rcc.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
    @Column(name = "username")
    private String username;

    @NotNull
    @Size(min = 5, max = 30)
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "author")
    private List<ChangeRequest> changeRequests;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ChangeRequest> getChangeRequests() {
        return changeRequests;
    }

    public void setChangeRequests(List<ChangeRequest> changeRequests) {
        this.changeRequests = changeRequests;
    }
}
