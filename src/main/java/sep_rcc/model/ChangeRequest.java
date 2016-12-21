package sep_rcc.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class ChangeRequest {

    @Id
    @GeneratedValue
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    private Long customerId;

    private String firstName;

    private String surname;

    private String streetName;

    private String streetNum;

    private String postalCode;

    private String cityPart;

    private String city;

    private String country;

    private int phoneNumberType;

    @Size(min = 10, max = 12)
    @Digits(fraction = 0, integer = 12)
    private String phoneNum;

    private String cityCode;

    private String countryCode;

    private CustomerStatus status;

    private String birthNum;

    private String countryOfOrigin;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ActionType actionType;

    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="author_id")
    private User author;

}
