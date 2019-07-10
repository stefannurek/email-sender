package emailsender.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MyEmail {

    private String address;
    private String subject;
    private String body;

}
