/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

import java.util.LinkedList;
import java.util.List;

public class MSymbol {

    private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();

    private final List<Object> eSymbolDeclaration = new LinkedList<Object>();

    private final List<Object> eSingleChar = new LinkedList<Object>();

    private final List<Object> eOpenInterval = new LinkedList<Object>();

    private final List<Object> eOpenLeftInterval = new LinkedList<Object>();

    private final List<Object> eOpenRightInterval = new LinkedList<Object>();

    private final List<Object> eInterval = new LinkedList<Object>();

    public MSymbol() {

    }

    public MSymbolDeclaration newSymbolDeclaration(
            String pName) {

        MSymbolDeclaration lSymbolDeclaration = new MSymbolDeclaration(pName);
        this.eSymbolDeclaration.add(lSymbolDeclaration);
        return lSymbolDeclaration;
    }

    public MSingleChar newSingleChar(
            String pBound,
            String pName) {

        MSingleChar lSingleChar = new MSingleChar(pBound, pName);
        this.eSingleChar.add(lSingleChar);
        return lSingleChar;
    }

    public MOpenInterval newOpenInterval(
            String pName) {

        MOpenInterval lOpenInterval = new MOpenInterval(pName);
        this.eOpenInterval.add(lOpenInterval);
        return lOpenInterval;
    }

    public MOpenLeftInterval newOpenLeftInterval(
            String pUpperBound,
            String pName) {

        MOpenLeftInterval lOpenLeftInterval = new MOpenLeftInterval(
                pUpperBound, pName);
        this.eOpenLeftInterval.add(lOpenLeftInterval);
        return lOpenLeftInterval;
    }

    public MOpenRightInterval newOpenRightInterval(
            String pLowerBound,
            String pName) {

        MOpenRightInterval lOpenRightInterval = new MOpenRightInterval(
                pLowerBound, pName);
        this.eOpenRightInterval.add(lOpenRightInterval);
        return lOpenRightInterval;
    }

    public MInterval newInterval(
            String pLowerBound,
            String pUpperBound,
            String pName) {

        MInterval lInterval = new MInterval(pLowerBound, pUpperBound, pName);
        this.eInterval.add(lInterval);
        return lInterval;
    }

    public MDefaultPackage newDefaultPackage(
            String pLanguageName) {

        MDefaultPackage lDefaultPackage = new MDefaultPackage(pLanguageName);
        this.eDefaultPackage_SpecifiedPackage.add(lDefaultPackage);
        return lDefaultPackage;
    }

    public MSpecifiedPackage newSpecifiedPackage(
            String pLanguageName,
            String pPackage) {

        MSpecifiedPackage lSpecifiedPackage = new MSpecifiedPackage(
                pLanguageName, pPackage);
        this.eDefaultPackage_SpecifiedPackage.add(lSpecifiedPackage);
        return lSpecifiedPackage;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        if (this.eDefaultPackage_SpecifiedPackage.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oDefaultPackage_SpecifiedPackage : this.eDefaultPackage_SpecifiedPackage) {
            sb.append(oDefaultPackage_SpecifiedPackage.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("enum Symbol {");
        sb.append(System.getProperty("line.separator"));
        for (Object oSymbolDeclaration : this.eSymbolDeclaration) {
            sb.append(oSymbolDeclaration.toString());
        }
        sb.append("  Symbol_end;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  static Symbol getSymbol(char c) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    switch(c) {");
        sb.append(System.getProperty("line.separator"));
        for (Object oSingleChar : this.eSingleChar) {
            sb.append(oSingleChar.toString());
        }
        sb.append("    default:");
        sb.append(System.getProperty("line.separator"));
        for (Object oOpenInterval : this.eOpenInterval) {
            sb.append(oOpenInterval.toString());
        }
        for (Object oOpenLeftInterval : this.eOpenLeftInterval) {
            sb.append(oOpenLeftInterval.toString());
        }
        for (Object oOpenRightInterval : this.eOpenRightInterval) {
            sb.append(oOpenRightInterval.toString());
        }
        for (Object oInterval : this.eInterval) {
            sb.append(oInterval.toString());
        }
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("    return null;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
