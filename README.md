# test-plugin-for-milad
A test IDEA plugin that adds "suggestion hello" and "suggestion world" completion each time you press _ctrl+space_ in a txt file

To open the project, in IDEA press _File -> New -> Project -> IntelliJ Platform Plugin_ ("Project SDK" should point to 
your IDEA installation directory) then click "Next". Now, in the "Project location" choose the path to this directory (test-plugin-for-milad), hit finish.

To run it, press _Run -> Run plugin_ or _Run -> Debug plugin_. Now open a plain .txt file in the new IDEA window, you should 
get `suggestion hello` and `suggestion world` completion when you hit _ctrl+space_
