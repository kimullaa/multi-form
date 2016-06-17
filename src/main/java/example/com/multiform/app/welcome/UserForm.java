package example.com.multiform.app.welcome;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.Size;

public class UserForm {
    @Size(max = 10, min = 1)
    private String familyName;
    @Size(max = 10, min = 1)
    private String givenName;

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public UserForm() {

    }

    public UserForm(String familyName, String givenName) {
        this.familyName = familyName;
        this.givenName = givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
