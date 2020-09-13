package shopProject.shopPackage.validatiors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateOfBirthValidator implements Validator{

	Pattern p = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0][1-9]|1[0-2])/\\d{2,4}");
    
	@Override
	public boolean validate(String vString) {
		Matcher m = p.matcher(vString);
        return m.find();
	}

}
