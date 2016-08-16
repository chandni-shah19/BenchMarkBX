package org.benchmarx.familiestopersons;

import PersonsModel.Persons;
import org.benchmarx.core.Comparator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class PersonsComparator implements Comparator<Persons> {
  @Override
  public void compare(final Persons expected, final Persons actual) {
    String _personsToString = this.personsToString(expected);
    String _personsToString_1 = this.personsToString(actual);
    Assert.assertEquals(_personsToString, _personsToString_1);
  }
  
  public String personsToString(final Persons persons) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Persons");
    _builder.newLine();
    return _builder.toString();
  }
}
