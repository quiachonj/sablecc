/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.bootstrap.macro;

public class Macro_nested_macro_additional_parameter {

    // parameter declarations
    private final String param_param_name;

    private final String param_nested_macro_name;

    private final String param_class_name;

    private final String param_protection;

    // nested macro declarations

    // constructor
    Macro_nested_macro_additional_parameter(
            String param_param_name,
            String param_nested_macro_name,
            String param_class_name,
            String param_protection) {

        this.param_param_name = param_param_name;
        this.param_nested_macro_name = param_nested_macro_name;
        this.param_class_name = param_class_name;
        this.param_protection = param_protection;
    }

    // toString
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(",");
        sb.append(System.getProperty("line.separator"));
        sb.append("      String param_");
        sb.append(this.param_param_name);
        return sb.toString();
    }

    // nested macros

}
