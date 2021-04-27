package co.com.choucair.certification.retoUtest.questions;

import co.com.choucair.certification.retoUtest.model.retoUtestData;
import static co.com.choucair.certification.retoUtest.userinterface.Verification.VERIFICATION_BUTTON;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import java.util.List;

public class Answer implements Question<Boolean> {

    List<retoUtestData> retoutestdata;

    public Answer(List<retoUtestData> retoutestdata) {
        this.retoutestdata = retoutestdata;
    }

    public static Answer toThe(List<retoUtestData> retoutestdata) {
        return new Answer(retoutestdata);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       boolean result;

       String message= Text.of(VERIFICATION_BUTTON).viewedBy(actor).asString();
       if (retoutestdata.get(0).strverification.equals(message)){
           result = true;
       }else{
           result = false;
       }
       return result;
    }
}
