package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class HelloWorldAction extends AnAction {
    int Eom =20;
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showInfoMessage("Hello World","Info");
    }
}
