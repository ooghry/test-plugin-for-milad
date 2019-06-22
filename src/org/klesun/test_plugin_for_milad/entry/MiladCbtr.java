package org.klesun.test_plugin_for_milad.entry;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class MiladCbtr extends CompletionContributor {
    MiladCbtr() {
        this.extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement()
            ,
            new CompletionProvider<CompletionParameters>() {
                protected void addCompletions(
                    @NotNull CompletionParameters completionParameters,
                    ProcessingContext processingContext,
                    @NotNull CompletionResultSet completionResultSet
                ) {
                    // for cursor position grep for "IntellijIdeaRulezzz " in psi.getText()
                    PsiElement psi = completionParameters.getPosition();
                    completionResultSet.addElement(LookupElementBuilder.create("suggestion hello"));
                    completionResultSet.addElement(LookupElementBuilder.create("suggestion world"));
                }
            }
        );
    }
}
