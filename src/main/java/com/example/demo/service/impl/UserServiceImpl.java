[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[48,25] cannot find symbol
  symbol:   method getPasswordEncoder()
  location: variable userService of type com.example.demo.service.impl.UserServiceImpl
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  27.683 s
[INFO] Finished at: 2025-12-26T08:30:52Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation failure
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[48,25] cannot find symbol
[ERROR]   symbol:   method getPasswordEncoder()
[ERROR]   location: variable userService of type com.example.demo.service.impl.UserServiceImpl
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException