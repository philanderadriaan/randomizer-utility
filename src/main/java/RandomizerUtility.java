import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class RandomizerUtility
{

  public static void log(String... lines)
  {
    for (String line : lines)
    {
      System.out.println(new Date() + " " + line);
    }
  }

  private static int dialog(int option, String title, String... msgs)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException,
      UnsupportedLookAndFeelException
  {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    return JOptionPane.showConfirmDialog(null, String.join("\n", msgs), title, option);
  }

  public static int dialogYesNo(String title, String... msgs) throws ClassNotFoundException,
      InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
  {
    return dialog(JOptionPane.YES_NO_OPTION, title, msgs);
  }

  public static int dialogError(String title, String... msgs) throws ClassNotFoundException,
      InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
  {
    return dialog(JOptionPane.ERROR_MESSAGE, title, msgs);
  }
}
