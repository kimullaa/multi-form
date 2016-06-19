package example.com.multiform.app.welcome;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserForm {
    @Size(max = 10, min = 1)
    private String familyName;
    @Size(max = 10, min = 1)
    private String givenName;
}
