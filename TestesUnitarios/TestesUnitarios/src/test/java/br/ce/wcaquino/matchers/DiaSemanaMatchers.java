package br.ce.wcaquino.matchers;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import br.ce.wcaquino.utils.DataUtils;

 public class DiaSemanaMatchers extends TypeSafeMatcher<Date> {

    private Integer diaSemanaMatchers;

    public DiaSemanaMatchers(Integer diaSemanaMatchers) {
        this.diaSemanaMatchers = diaSemanaMatchers;
    }

    @Override
    public void describeTo(Description desc) {
        Calendar data = Calendar.getInstance();
        data.set(Calendar.DAY_OF_WEEK, diaSemanaMatchers);
        String dataExtenso = data.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("pt", "BR"));
        desc.appendText(dataExtenso);
    }

    @Override
    protected boolean matchesSafely(Date date) {
        return DataUtils.verificarDiaSemana(date, diaSemanaMatchers);
    }
}
