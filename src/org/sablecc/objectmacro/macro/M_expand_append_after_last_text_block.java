/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

public class M_expand_append_after_last_text_block
        extends Macro {

    // ---- constructor ----

    M_expand_append_after_last_text_block(
            Macro parent,
            String p_text_block_name) {

        this.parent = parent;
        this.p_text_block_name = p_text_block_name;
    }

    // ---- parent ----

    private final Macro parent;

    @Override
    Macro get_parent() {

        return this.parent;
    }

    // ---- parameters ----

    private final String p_text_block_name;

    String get_local_p_text_block_name() {

        return this.p_text_block_name;
    }

    // ---- parameter accessors ----

    private String cached_p_text_block_name;

    private String get_p_text_block_name() {

        String result = this.cached_p_text_block_name;

        if (result == null) {
            Macro current = this;

            while (!(current instanceof M_expand_append_after_last_text_block)) {
                current = current.get_parent();
            }

            result = ((M_expand_append_after_last_text_block) current)
                    .get_local_p_text_block_name();
            this.cached_p_text_block_name = result;
        }

        return result;
    }

    // ---- appendTo ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("      get_t_");

        sb.append(get_p_text_block_name());

        sb.append("().appendTo(sb);");

        sb.append(EOL);
    }

}
