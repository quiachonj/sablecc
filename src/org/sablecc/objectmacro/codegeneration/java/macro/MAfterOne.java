/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.LinkedList;
import java.util.List;

public class MAfterOne {

    private final MExpandInsertPart mExpandInsertPart;

    private final List<Object> eString_ParamInsert_TextInsert = new LinkedList<Object>();

    MAfterOne(
            MExpandInsertPart mExpandInsertPart) {

        if (mExpandInsertPart == null) {
            throw new NullPointerException();
        }
        this.mExpandInsertPart = mExpandInsertPart;
    }

    public MString newString(
            String pString) {

        MString lString = new MString(pString);
        this.eString_ParamInsert_TextInsert.add(lString);
        return lString;
    }

    public MParamInsert newParamInsert(
            String pName) {

        MParamInsert lParamInsert = new MParamInsert(pName);
        this.eString_ParamInsert_TextInsert.add(lParamInsert);
        return lParamInsert;
    }

    public MTextInsert newTextInsert(
            String pName) {

        MTextInsert lTextInsert = new MTextInsert(pName);
        this.eString_ParamInsert_TextInsert.add(lTextInsert);
        return lTextInsert;
    }

    private String rName() {

        return this.mExpandInsertPart.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    if(this.e");
        sb.append(rName());
        sb.append(".size() == 0) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("      sb.append(");
        for (Object oString_ParamInsert_TextInsert : this.eString_ParamInsert_TextInsert) {
            sb.append(oString_ParamInsert_TextInsert.toString());
        }
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
