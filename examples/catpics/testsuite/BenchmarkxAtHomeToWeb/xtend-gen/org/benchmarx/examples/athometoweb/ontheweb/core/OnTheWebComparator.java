package org.benchmarx.examples.athometoweb.ontheweb.core;

import OnTheWeb.Web;
import OnTheWeb.WebElement;
import org.benchmarx.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class OnTheWebComparator implements Comparator<Web> {
  @Override
  public void compare(final Web expected, final Web actual) {
    String _OnTheWebToString = this.OnTheWebToString(expected);
    boolean _startsWith = _OnTheWebToString.startsWith("Web");
    Assert.assertTrue(_startsWith);
    String _OnTheWebToString_1 = this.OnTheWebToString(expected);
    String _OnTheWebToString_2 = this.OnTheWebToString(actual);
    Assert.assertEquals(_OnTheWebToString_1, _OnTheWebToString_2);
  }
  
  public String OnTheWebToString(final Web elements) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Web {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("WebElemets = [");
    _builder.newLine();
    {
      EList<WebElement> _elements = elements.getElements();
      for(final WebElement we : _elements) {
        _builder.append("\t");
        _builder.append("picture = ");
        String _picture = we.getPicture();
        _builder.append(_picture, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
