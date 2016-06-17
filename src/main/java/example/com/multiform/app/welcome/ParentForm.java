package example.com.multiform.app.welcome;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class ParentForm {
    @Valid
    private List<UserForm> userFormList;

    public ParentForm() {
        userFormList = new ArrayList<>();
    }

    public List<UserForm> getUserFormList() {
        return userFormList;
    }

    public void setUserFormList(List<UserForm> userFormList) {
        this.userFormList = userFormList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
