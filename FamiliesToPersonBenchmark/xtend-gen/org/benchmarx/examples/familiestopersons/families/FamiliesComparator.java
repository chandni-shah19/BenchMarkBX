package org.benchmarx.examples.familiestopersons.families;

import Families.Family;
import Families.FamilyMember;
import Families.FamilyRegister;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.benchmarx.core.Comparator;
import org.benchmarx.examples.familiestopersons.families.FamilyNormaliser;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class FamiliesComparator implements Comparator<FamilyRegister> {
  private FamilyNormaliser comparator;
  
  @Override
  public void compare(final FamilyRegister expected, final FamilyRegister actual) {
    FamilyNormaliser _familyNormaliser = new FamilyNormaliser();
    this.comparator = _familyNormaliser;
    String _familyToString = this.familyToString(expected);
    String _familyToString_1 = this.familyToString(actual);
    Assert.assertEquals(_familyToString, _familyToString_1);
  }
  
  public String familyToString(final FamilyRegister families) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Families {");
    _builder.newLine();
    _builder.append("\t");
    EList<Family> _families = families.getFamilies();
    final List<Family> sortedList = new ArrayList<Family>(_families);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.comparator.normalize(sortedList);
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final Family f : sortedList) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        _builder.append("\t");
        _builder.append("Family ");
        String _name = f.getName();
        _builder.append(_name, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("  ");
        _builder.append("Father: ");
        {
          FamilyMember _father = f.getFather();
          boolean _notEquals = (!Objects.equal(_father, null));
          if (_notEquals) {
            FamilyMember _father_1 = f.getFather();
            String _name_1 = _father_1.getName();
            _builder.append(_name_1, "\t  ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("  ");
        _builder.append("Mother: ");
        {
          FamilyMember _mother = f.getMother();
          boolean _notEquals_1 = (!Objects.equal(_mother, null));
          if (_notEquals_1) {
            FamilyMember _mother_1 = f.getMother();
            String _name_2 = _mother_1.getName();
            _builder.append(_name_2, "\t  ");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          EList<FamilyMember> _sons = f.getSons();
          boolean _hasElements_1 = false;
          for(final FamilyMember f_Son : _sons) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate("\n", "\t\t");
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("Son ");
            String _name_3 = f_Son.getName();
            _builder.append(_name_3, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<FamilyMember> _daughters = f.getDaughters();
          boolean _hasElements_2 = false;
          for(final FamilyMember f_Daughter : _daughters) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate("\n", "\t\t");
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("Daughter ");
            String _name_4 = f_Daughter.getName();
            _builder.append(_name_4, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
