/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MSetMarkerDeclaration {

    private final String pName;

    private final MSetMarkerDeclaration mSetMarkerDeclaration = this;

    MSetMarkerDeclaration(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mSetMarkerDeclaration.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  void setMarker");
        sb.append(rName());
        sb.append("() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    this.marker");
        sb.append(rName());
        sb.append(" = this.current_sb_length;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
