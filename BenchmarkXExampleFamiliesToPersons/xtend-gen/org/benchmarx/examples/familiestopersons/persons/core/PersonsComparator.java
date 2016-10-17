package org.benchmarx.examples.familiestopersons.persons.core;

import Persons.Male;
import Persons.Person;
import Persons.PersonRegister;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.benchmarx.Comparator;
import org.benchmarx.examples.familiestopersons.persons.core.PersonNormaliser;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class PersonsComparator implements Comparator<PersonRegister> {
  private PersonNormaliser comparator;
  
  @Override
  public void compare(final PersonRegister expected, final PersonRegister actual) {
    PersonNormaliser _personNormaliser = new PersonNormaliser();
    this.comparator = _personNormaliser;
    String _personsToString = this.personsToString(expected);
    String _personsToString_1 = this.personsToString(actual);
    Assert.assertEquals(_personsToString, _personsToString_1);
  }
  
  public String personsToString(final PersonRegister persons) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Persons\t{");
    _builder.newLine();
    _builder.append("\t");
    EList<Person> _persons = persons.getPersons();
    final List<Person> sortedList = new ArrayList<Person>(_persons);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.comparator.normalize(sortedList);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final Person p : sortedList) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        {
          if ((p instanceof Male)) {
            _builder.append("\t");
            _builder.append("Male: ");
            String _name = ((Male)p).getName();
            _builder.append(_name, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("Birthday: ");
            Date _birthday = ((Male)p).getBirthday();
            _builder.append(_birthday, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("Female: ");
            String _name_1 = p.getName();
            _builder.append(_name_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("Birthday: ");
            Date _birthday_1 = p.getBirthday();
            _builder.append(_birthday_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
}
