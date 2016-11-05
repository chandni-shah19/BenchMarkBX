package org.benchmarx.examples.athometoweb.athome.core;

import AtHome.Directory;
import AtHome.File;
import org.benchmarx.Comparator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;

@SuppressWarnings("all")
public class AtHomeComparator implements Comparator<Directory> {
  @Override
  public void compare(final Directory expected, final Directory actual) {
    String _AtHomeToString = this.AtHomeToString(expected);
    String _AtHomeToString_1 = this.AtHomeToString(actual);
    Assert.assertEquals(_AtHomeToString, _AtHomeToString_1);
  }
  
  public String AtHomeToString(final Directory directories) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DirectoryRoot {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Directories = [");
    _builder.newLine();
    {
      EList<Directory> _subDirs = directories.getSubDirs();
      for(final Directory dir : _subDirs) {
        _builder.append("\t");
        _builder.append("Directory {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("name = ");
        String _name = dir.getName();
        _builder.append(_name, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          EList<File> _files = dir.getFiles();
          for(final File fl : _files) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("Files {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("picture = ");
            String _picture = fl.getPicture();
            _builder.append(_picture, "\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
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
