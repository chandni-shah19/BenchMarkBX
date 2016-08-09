package org.benchmarx.familiestopersons;

import FamiliesModel.Families;
import FamiliesModel.Family;
import org.benchmarx.core.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class FamiliesComparator implements Comparator<Families> {
  @Override
  public void compare(final Families expected, final Families actual) {
    CharSequence _familyToString = this.familyToString(expected);
    CharSequence _familyToString_1 = this.familyToString(actual);
    Assert.assertEquals(_familyToString, _familyToString_1);
  }
  
  public CharSequence familyToString(final Families families) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Families {");
    _builder.newLine();
    {
      EList<Family> _family = families.getFamily();
      boolean _hasElements = false;
      for(final Family f : _family) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        _builder.append("\t");
        _builder.append("Family ");
        String _familyName = f.getFamilyName();
        _builder.append(_familyName, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
