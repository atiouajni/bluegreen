Last login: Tue May 23 08:01:00 on ttys001

The default interactive shell is now zsh.
To update your account to use zsh, please run `chsh -s /bin/zsh`.
For more details, please visit https://support.apple.com/kb/HT208050.
anissetiouajni@atiouajn-mac:~/vscode-workspace/tekton-demo$cd ..
anissetiouajni@atiouajn-mac:~/vscode-workspace$mvn io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create \ -DprojectGroupId=io.project \ -DprojectArtifactId=bluegreen \ -Dextensions='resteasy-reactive-jackson' \ -DnoCode
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.068 s
[INFO] Finished at: 2023-05-23T08:02:25+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] The goal you specified requires a project to execute but there is no POM in this directory (/Users/anissetiouajni/vscode-workspace). Please verify you invoked Maven from the correct directory. -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MissingProjectException
anissetiouajni@atiouajn-mac:~/vscode-workspace$mvn io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create  -DprojectGroupId=io.project  -DprojectArtifactId=bluegreen  -Dextensions='resteasy-reactive-jackson'  -DnoCode
[INFO] Scanning for projects...
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/platform/quarkus-maven-plugin/3.0.3.Final/quarkus-maven-plugin-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/platform/quarkus-maven-plugin/3.0.3.Final/quarkus-maven-plugin-3.0.3.Final.pom (10 kB at 12 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/platform/quarkus-bom/3.0.3.Final/quarkus-bom-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/platform/quarkus-bom/3.0.3.Final/quarkus-bom-3.0.3.Final.pom (375 kB at 557 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/platform/quarkus-maven-plugin/3.0.3.Final/quarkus-maven-plugin-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/platform/quarkus-maven-plugin/3.0.3.Final/quarkus-maven-plugin-3.0.3.Final.jar (402 kB at 688 kB/s)
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:3.0.3.Final:create (default-cli) @ standalone-pom ---
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-core/3.0.3.Final/quarkus-bootstrap-core-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-core/3.0.3.Final/quarkus-bootstrap-core-3.0.3.Final.pom (4.0 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-parent/3.0.3.Final/quarkus-bootstrap-parent-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-parent/3.0.3.Final/quarkus-bootstrap-parent-3.0.3.Final.pom (21 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-bom/3.0.3.Final/quarkus-bootstrap-bom-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-bom/3.0.3.Final/quarkus-bootstrap-bom-3.0.3.Final.pom (21 kB at 131 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-bom-test/3.0.3.Final/quarkus-bootstrap-bom-test-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-bom-test/3.0.3.Final/quarkus-bootstrap-bom-test-3.0.3.Final.pom (3.0 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-app-model/3.0.3.Final/quarkus-bootstrap-app-model-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-app-model/3.0.3.Final/quarkus-bootstrap-app-model-3.0.3.Final.pom (3.6 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-maven-resolver/3.0.3.Final/quarkus-bootstrap-maven-resolver-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-maven-resolver/3.0.3.Final/quarkus-bootstrap-maven-resolver-3.0.3.Final.pom (6.9 kB at 28 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core-deployment/3.0.3.Final/quarkus-core-deployment-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core-deployment/3.0.3.Final/quarkus-core-deployment-3.0.3.Final.pom (9.4 kB at 74 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core-parent/3.0.3.Final/quarkus-core-parent-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core-parent/3.0.3.Final/quarkus-core-parent-3.0.3.Final.pom (963 B at 4.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-build-parent/3.0.3.Final/quarkus-build-parent-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-build-parent/3.0.3.Final/quarkus-build-parent-3.0.3.Final.pom (67 kB at 346 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-parent/3.0.3.Final/quarkus-parent-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-parent/3.0.3.Final/quarkus-parent-3.0.3.Final.pom (16 kB at 124 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bom/3.0.3.Final/quarkus-bom-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bom/3.0.3.Final/quarkus-bom-3.0.3.Final.pom (382 kB at 682 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/gizmo/gizmo/1.6.1.Final/gizmo-1.6.1.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/gizmo/gizmo/1.6.1.Final/gizmo-1.6.1.Final.pom (10 kB at 86 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-development-mode-spi/3.0.3.Final/quarkus-development-mode-spi-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-development-mode-spi/3.0.3.Final/quarkus-development-mode-spi-3.0.3.Final.pom (758 B at 5.7 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-class-change-agent/3.0.3.Final/quarkus-class-change-agent-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-class-change-agent/3.0.3.Final/quarkus-class-change-agent-3.0.3.Final.pom (1.8 kB at 14 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-utilities/3.0.3.Final/quarkus-devtools-utilities-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-utilities/3.0.3.Final/quarkus-devtools-utilities-3.0.3.Final.pom (583 B at 5.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-tools-parent/3.0.3.Final/quarkus-tools-parent-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-tools-parent/3.0.3.Final/quarkus-tools-parent-3.0.3.Final.pom (22 kB at 158 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core/3.0.3.Final/quarkus-core-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core/3.0.3.Final/quarkus-core-3.0.3.Final.pom (15 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-runner/3.0.3.Final/quarkus-bootstrap-runner-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-runner/3.0.3.Final/quarkus-bootstrap-runner-3.0.3.Final.pom (3.5 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-builder/3.0.3.Final/quarkus-builder-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-builder/3.0.3.Final/quarkus-builder-3.0.3.Final.pom (2.4 kB at 10 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-project-core-extension-codestarts/3.0.3.Final/quarkus-project-core-extension-codestarts-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-project-core-extension-codestarts/3.0.3.Final/quarkus-project-core-extension-codestarts-3.0.3.Final.pom (3.1 kB at 13 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-all/3.0.3.Final/quarkus-devtools-all-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-all/3.0.3.Final/quarkus-devtools-all-3.0.3.Final.pom (997 B at 2.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-common/3.0.3.Final/quarkus-devtools-common-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-common/3.0.3.Final/quarkus-devtools-common-3.0.3.Final.pom (4.6 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-registry-client/3.0.3.Final/quarkus-devtools-registry-client-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-registry-client/3.0.3.Final/quarkus-devtools-registry-client-3.0.3.Final.pom (2.2 kB at 19 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-message-writer/3.0.3.Final/quarkus-devtools-message-writer-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-message-writer/3.0.3.Final/quarkus-devtools-message-writer-3.0.3.Final.pom (776 B at 3.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-base-codestarts/3.0.3.Final/quarkus-devtools-base-codestarts-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-base-codestarts/3.0.3.Final/quarkus-devtools-base-codestarts-3.0.3.Final.pom (910 B at 3.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-codestarts/3.0.3.Final/quarkus-devtools-codestarts-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-codestarts/3.0.3.Final/quarkus-devtools-codestarts-3.0.3.Final.pom (2.2 kB at 9.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/qute/qute-core/3.0.3.Final/qute-core-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/qute/qute-core/3.0.3.Final/qute-core-3.0.3.Final.pom (1.2 kB at 10 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/qute/qute-parent/3.0.3.Final/qute-parent-3.0.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/qute/qute-parent/3.0.3.Final/qute-parent-3.0.3.Final.pom (18 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-core/3.0.3.Final/quarkus-bootstrap-core-3.0.3.Final.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-app-model/3.0.3.Final/quarkus-bootstrap-app-model-3.0.3.Final.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-maven-resolver/3.0.3.Final/quarkus-bootstrap-maven-resolver-3.0.3.Final.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core-deployment/3.0.3.Final/quarkus-core-deployment-3.0.3.Final.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/gizmo/gizmo/1.6.1.Final/gizmo-1.6.1.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-core/3.0.3.Final/quarkus-bootstrap-core-3.0.3.Final.jar (120 kB at 390 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-development-mode-spi/3.0.3.Final/quarkus-development-mode-spi-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/gizmo/gizmo/1.6.1.Final/gizmo-1.6.1.Final.jar (168 kB at 211 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-class-change-agent/3.0.3.Final/quarkus-class-change-agent-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-development-mode-spi/3.0.3.Final/quarkus-development-mode-spi-3.0.3.Final.jar (44 kB at 46 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-utilities/3.0.3.Final/quarkus-devtools-utilities-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-maven-resolver/3.0.3.Final/quarkus-bootstrap-maven-resolver-3.0.3.Final.jar (140 kB at 128 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core/3.0.3.Final/quarkus-core-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-utilities/3.0.3.Final/quarkus-devtools-utilities-3.0.3.Final.jar (5.3 kB at 4.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-runner/3.0.3.Final/quarkus-bootstrap-runner-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-class-change-agent/3.0.3.Final/quarkus-class-change-agent-3.0.3.Final.jar (3.3 kB at 2.6 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-builder/3.0.3.Final/quarkus-builder-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-app-model/3.0.3.Final/quarkus-bootstrap-app-model-3.0.3.Final.jar (172 kB at 130 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-project-core-extension-codestarts/3.0.3.Final/quarkus-project-core-extension-codestarts-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-bootstrap-runner/3.0.3.Final/quarkus-bootstrap-runner-3.0.3.Final.jar (43 kB at 23 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-common/3.0.3.Final/quarkus-devtools-common-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-builder/3.0.3.Final/quarkus-builder-3.0.3.Final.jar (66 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-registry-client/3.0.3.Final/quarkus-devtools-registry-client-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core/3.0.3.Final/quarkus-core-3.0.3.Final.jar (292 kB at 136 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-message-writer/3.0.3.Final/quarkus-devtools-message-writer-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-message-writer/3.0.3.Final/quarkus-devtools-message-writer-3.0.3.Final.jar (6.4 kB at 2.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-base-codestarts/3.0.3.Final/quarkus-devtools-base-codestarts-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-registry-client/3.0.3.Final/quarkus-devtools-registry-client-3.0.3.Final.jar (216 kB at 72 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-codestarts/3.0.3.Final/quarkus-devtools-codestarts-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-common/3.0.3.Final/quarkus-devtools-common-3.0.3.Final.jar (364 kB at 118 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/quarkus/qute/qute-core/3.0.3.Final/qute-core-3.0.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-project-core-extension-codestarts/3.0.3.Final/quarkus-project-core-extension-codestarts-3.0.3.Final.jar (275 kB at 80 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-codestarts/3.0.3.Final/quarkus-devtools-codestarts-3.0.3.Final.jar (84 kB at 23 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/qute/qute-core/3.0.3.Final/qute-core-3.0.3.Final.jar (312 kB at 75 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-devtools-base-codestarts/3.0.3.Final/quarkus-devtools-base-codestarts-3.0.3.Final.jar (398 kB at 92 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/quarkus/quarkus-core-deployment/3.0.3.Final/quarkus-core-deployment-3.0.3.Final.jar (1.4 MB at 260 kB/s)
[INFO] Looking for the newly published extensions in registry.quarkus.io
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  33.940 s
[INFO] Finished at: 2023-05-23T08:03:21+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create (default-cli) on project standalone-pom: Unable to create the project, the directory /Users/anissetiouajni/vscode-workspace/bluegreen already exists -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
anissetiouajni@atiouajn-mac:~/vscode-workspace$mvn io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create  -DprojectGroupId=io.project  -DprojectArtifactId=bluegreen-quarkus  -Dextensions='resteasy-reactive-jackson'  -DnoCode
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:3.0.3.Final:create (default-cli) @ standalone-pom ---
^Canissetiouajni@atiouajn-mac:~/vscode-workspace$cd bluegreen/src/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$mvn io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create  -DprojectGroupId=io.project  -DprojectArtifactId=bluegreen-quarkus  -Dextensions='resteasy-reactive-jackson'  -DnoCode
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:3.0.3.Final:create (default-cli) @ standalone-pom ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.990 s
[INFO] Finished at: 2023-05-23T08:04:01+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create (default-cli) on project standalone-pom: Unable to create the project, the directory /Users/anissetiouajni/vscode-workspace/bluegreen/src/bluegreen-quarkus already exists -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$ll
total 16
drwxr-xr-x  5 anissetiouajni  staff   160B 23 mai 07:54 ./
drwxr-xr-x  9 anissetiouajni  staff   288B 23 mai 07:54 ../
-rw-r--r--@ 1 anissetiouajni  staff   6,0K 23 mai 07:54 .DS_Store
drwxr-xr-x  6 anissetiouajni  staff   192B 20 avr 13:31 bluegreen-php/
drwxr-xr-x  3 anissetiouajni  staff    96B 23 mai 07:54 bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$cd bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$ll
total 8
drwxr-xr-x  3 anissetiouajni  staff    96B 23 mai 07:54 ./
drwxr-xr-x  5 anissetiouajni  staff   160B 23 mai 07:54 ../
-rw-r--r--  1 anissetiouajni  staff   486B 20 avr 13:30 README.md
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$cp README.md ../
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$ll
total 8
drwxr-xr-x  3 anissetiouajni  staff    96B 23 mai 07:54 ./
drwxr-xr-x  6 anissetiouajni  staff   192B 23 mai 08:04 ../
-rw-r--r--  1 anissetiouajni  staff   486B 20 avr 13:30 README.md
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$cd ..
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$ll
total 24
drwxr-xr-x  6 anissetiouajni  staff   192B 23 mai 08:04 ./
drwxr-xr-x  9 anissetiouajni  staff   288B 23 mai 07:54 ../
-rw-r--r--@ 1 anissetiouajni  staff   6,0K 23 mai 07:54 .DS_Store
-rw-r--r--  1 anissetiouajni  staff   486B 23 mai 08:04 README.md
drwxr-xr-x  6 anissetiouajni  staff   192B 20 avr 13:31 bluegreen-php/
drwxr-xr-x  3 anissetiouajni  staff    96B 23 mai 07:54 bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$rm -rf bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$mvn io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create  -DprojectGroupId=io.project  -DprojectArtifactId=bluegreen-quarkus  -Dextensions='resteasy-reactive-jackson'  -DnoCode
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:3.0.3.Final:create (default-cli) @ standalone-pom ---
[INFO] -----------
[INFO] selected extensions: 
- io.quarkus:quarkus-resteasy-reactive-jackson

[INFO] 
applying codestarts...
[INFO] 📚 java
🔨 maven
📦 quarkus
📝 config-properties
🔧 dockerfiles
🔧 maven-wrapper
[INFO] 
-----------
[SUCCESS] ✅  quarkus project has been successfully generated in:
--> /Users/anissetiouajni/vscode-workspace/bluegreen/src/bluegreen-quarkus
-----------
[INFO] 
[INFO] ========================================================================================
[INFO] Your new application has been created in /Users/anissetiouajni/vscode-workspace/bluegreen/src/bluegreen-quarkus
[INFO] Navigate into this directory and launch your application with mvn quarkus:dev
[INFO] Your application will be accessible on http://localhost:8080
[INFO] ========================================================================================
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.829 s
[INFO] Finished at: 2023-05-23T08:05:00+01:00
[INFO] ------------------------------------------------------------------------
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$mv README.md bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$ll
total 16
drwxr-xr-x   5 anissetiouajni  staff   160B 23 mai 08:05 ./
drwxr-xr-x   9 anissetiouajni  staff   288B 23 mai 07:54 ../
-rw-r--r--@  1 anissetiouajni  staff   6,0K 23 mai 07:54 .DS_Store
drwxr-xr-x   6 anissetiouajni  staff   192B 20 avr 13:31 bluegreen-php/
drwxr-xr-x  10 anissetiouajni  staff   320B 23 mai 08:05 bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$cd bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$ll
total 72
drwxr-xr-x  10 anissetiouajni  staff   320B 23 mai 08:05 ./
drwxr-xr-x   5 anissetiouajni  staff   160B 23 mai 08:05 ../
-rw-r--r--   1 anissetiouajni  staff    75B 23 mai 08:05 .dockerignore
-rw-r--r--   1 anissetiouajni  staff   396B 23 mai 08:05 .gitignore
drwxr-xr-x   3 anissetiouajni  staff    96B 23 mai 08:05 .mvn/
-rw-r--r--   1 anissetiouajni  staff   486B 23 mai 08:04 README.md
-rwxr-xr-x   1 anissetiouajni  staff    11K 23 mai 08:05 mvnw*
-rw-r--r--   1 anissetiouajni  staff   7,4K 23 mai 08:05 mvnw.cmd
-rw-r--r--   1 anissetiouajni  staff   4,0K 23 mai 08:05 pom.xml
drwxr-xr-x   3 anissetiouajni  staff    96B 23 mai 08:05 src/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$cd ..
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$git status
Sur la branche main
Votre branche est à jour avec 'origin/main'.

Modifications qui ne seront pas validées :
  (utilisez "git add/rm <fichier>..." pour mettre à jour ce qui sera validé)
  (utilisez "git restore <fichier>..." pour annuler les modifications dans le répertoire de travail)
	supprimé :        ../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml
	supprimé :        ../openshift-manifests/bluegreen-php/bluegreen-php-deploymentconfig.yaml
	supprimé :        ../openshift-manifests/bluegreen-php/bluegreen-php-imagestream.yaml
	supprimé :        ../openshift-manifests/bluegreen-php/bluegreen-php-route.yaml
	modifié :         bluegreen-php/README.md

Fichiers non suivis:
  (utilisez "git add <fichier>..." pour inclure dans ce qui sera validé)
	bluegreen-quarkus/

aucune modification n'a été ajoutée à la validation (utilisez "git add" ou "git commit -a")
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$git cd ..
git : 'cd' n'est pas une commande git. Voir 'git --help'.

La commande la plus ressemblante est
	add
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$cd ..
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$tree
.
├── docs
│   ├── img
│   │   ├── blue-green-50-50.png
│   │   ├── blue.png
│   │   ├── green.png
│   │   ├── http-response-service-blue.png
│   │   ├── http-response-service-default.png
│   │   ├── http-response-service-green.png
│   │   ├── podname-blue-green-50-50.png
│   │   └── rolling-deployment.gif
│   └── readme.md
├── openshift-manifests
│   └── bluegreen-php
│       ├── bluegreen-php-service.yaml
│       ├── buildconfig.yaml
│       ├── deploymentconfig.yaml
│       ├── imagestream.yaml
│       └── route.yaml
├── readme.md
├── respy
└── src
    ├── bluegreen-php
    │   ├── README.md
    │   ├── color.php
    │   ├── image.php
    │   └── index.php
    └── bluegreen-quarkus
        ├── README.md
        ├── mvnw
        ├── mvnw.cmd
        ├── pom.xml
        └── src
            └── main
                ├── docker
                │   ├── Dockerfile.jvm
                │   ├── Dockerfile.legacy-jar
                │   ├── Dockerfile.native
                │   └── Dockerfile.native-micro
                ├── java
                └── resources
                    └── application.properties

12 directories, 29 files
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$git rm ../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml
fatal : ../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml : '../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml' est hors du dépôt à '/Users/anissetiouajni/vscode-workspace/bluegreen'
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$git restore ../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml
fatal : ../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml : '../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml' est hors du dépôt à '/Users/anissetiouajni/vscode-workspace/bluegreen'
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$git status
Sur la branche main
Votre branche est à jour avec 'origin/main'.

Modifications qui ne seront pas validées :
  (utilisez "git add <fichier>..." pour mettre à jour ce qui sera validé)
  (utilisez "git restore <fichier>..." pour annuler les modifications dans le répertoire de travail)
	modifié :         src/bluegreen-php/README.md

Fichiers non suivis:
  (utilisez "git add <fichier>..." pour inclure dans ce qui sera validé)
	src/bluegreen-quarkus/

aucune modification n'a été ajoutée à la validation (utilisez "git add" ou "git commit -a")
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$git rm ../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml
fatal : ../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml : '../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml' est hors du dépôt à '/Users/anissetiouajni/vscode-workspace/bluegreen'
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$tree
.
├── docs
│   ├── img
│   │   ├── blue-green-50-50.png
│   │   ├── blue.png
│   │   ├── green.png
│   │   ├── http-response-service-blue.png
│   │   ├── http-response-service-default.png
│   │   ├── http-response-service-green.png
│   │   ├── podname-blue-green-50-50.png
│   │   └── rolling-deployment.gif
│   └── readme.md
├── openshift-manifests
│   └── bluegreen-php
│       ├── bluegreen-php-buildconfig.yaml
│       ├── bluegreen-php-deploymentconfig.yaml
│       ├── bluegreen-php-imagestream.yaml
│       ├── bluegreen-php-route.yaml
│       ├── bluegreen-php-service.yaml
│       ├── buildconfig.yaml
│       ├── deploymentconfig.yaml
│       ├── imagestream.yaml
│       └── route.yaml
├── readme.md
├── respy
└── src
    ├── bluegreen-php
    │   ├── README.md
    │   ├── color.php
    │   ├── image.php
    │   └── index.php
    └── bluegreen-quarkus
        ├── README.md
        ├── mvnw
        ├── mvnw.cmd
        ├── pom.xml
        ├── src
        │   └── main
        │       ├── docker
        │       │   ├── Dockerfile.jvm
        │       │   ├── Dockerfile.legacy-jar
        │       │   ├── Dockerfile.native
        │       │   └── Dockerfile.native-micro
        │       ├── java
        │       └── resources
        │           └── application.properties
        └── target
            └── classes
                └── META-INF
                    └── MANIFEST.MF

15 directories, 34 files
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$cd openshift-manifests/bluegreen-php/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$ll
total 72
drwxr-xr-x  11 anissetiouajni  staff   352B 23 mai 08:10 ./
drwxr-xr-x   4 anissetiouajni  staff   128B 23 mai 08:10 ../
-rw-r--r--   1 anissetiouajni  staff   738B 23 mai 08:09 bluegreen-php-buildconfig.yaml
-rw-r--r--   1 anissetiouajni  staff   793B 23 mai 08:09 bluegreen-php-deploymentconfig.yaml
-rw-r--r--   1 anissetiouajni  staff   148B 23 mai 08:09 bluegreen-php-imagestream.yaml
-rw-r--r--   1 anissetiouajni  staff   224B 23 mai 08:09 bluegreen-php-route.yaml
-rw-r--r--   1 anissetiouajni  staff   352B 20 avr 13:30 bluegreen-php-service.yaml
-rw-r--r--   1 anissetiouajni  staff   738B 20 avr 13:30 buildconfig.yaml
-rw-r--r--   1 anissetiouajni  staff   793B 20 avr 13:30 deploymentconfig.yaml
-rw-r--r--   1 anissetiouajni  staff   148B 20 avr 13:30 imagestream.yaml
-rw-r--r--   1 anissetiouajni  staff   224B 20 avr 13:30 route.yaml
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$git rm bluegreen-php-buildconfig.yaml
rm 'openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml'
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$git rm bluegreen-php-deploymentconfig.yaml
rm 'openshift-manifests/bluegreen-php/bluegreen-php-deploymentconfig.yaml'
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$git rm  bluegreen-php-imagestream.yaml
rm 'openshift-manifests/bluegreen-php/bluegreen-php-imagestream.yaml'
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$git rm  bluegreen-php-route.yaml
rm 'openshift-manifests/bluegreen-php/bluegreen-php-route.yaml'
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$ll
total 40
drwxr-xr-x  7 anissetiouajni  staff   224B 23 mai 08:11 ./
drwxr-xr-x  4 anissetiouajni  staff   128B 23 mai 08:10 ../
-rw-r--r--  1 anissetiouajni  staff   352B 20 avr 13:30 bluegreen-php-service.yaml
-rw-r--r--  1 anissetiouajni  staff   738B 20 avr 13:30 buildconfig.yaml
-rw-r--r--  1 anissetiouajni  staff   793B 20 avr 13:30 deploymentconfig.yaml
-rw-r--r--  1 anissetiouajni  staff   148B 20 avr 13:30 imagestream.yaml
-rw-r--r--  1 anissetiouajni  staff   224B 20 avr 13:30 route.yaml
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$git status
Sur la branche main
Votre branche est à jour avec 'origin/main'.

Modifications qui seront validées :
  (utilisez "git restore --staged <fichier>..." pour désindexer)
	supprimé :        bluegreen-php-buildconfig.yaml
	supprimé :        bluegreen-php-deploymentconfig.yaml
	supprimé :        bluegreen-php-imagestream.yaml
	supprimé :        bluegreen-php-route.yaml

Modifications qui ne seront pas validées :
  (utilisez "git add <fichier>..." pour mettre à jour ce qui sera validé)
  (utilisez "git restore <fichier>..." pour annuler les modifications dans le répertoire de travail)
	modifié :         ../../src/bluegreen-php/README.md

Fichiers non suivis:
  (utilisez "git add <fichier>..." pour inclure dans ce qui sera validé)
	../../src/bluegreen-quarkus/

anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$git commit -m "renaming manifest to avoid duplicate"
[main 23c1976] renaming manifest to avoid duplicate
 4 files changed, 98 deletions(-)
 delete mode 100644 openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml
 delete mode 100644 openshift-manifests/bluegreen-php/bluegreen-php-deploymentconfig.yaml
 delete mode 100644 openshift-manifests/bluegreen-php/bluegreen-php-imagestream.yaml
 delete mode 100644 openshift-manifests/bluegreen-php/bluegreen-php-route.yaml
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$git push
Énumération des objets: 7, fait.
Décompte des objets: 100% (7/7), fait.
Compression par delta en utilisant jusqu'à 12 fils d'exécution
Compression des objets: 100% (3/3), fait.
Écriture des objets: 100% (4/4), 350 octets | 350.00 Kio/s, fait.
Total 4 (delta 2), réutilisés 0 (delta 0), réutilisés du pack 0
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To github.com:atiouajni/bluegreen.git
   1de2ae1..23c1976  main -> main
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests/bluegreen-php$cd ..
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests$cd ..
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$cd openshift-manifests/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests$ll
total 16
drwxr-xr-x  4 anissetiouajni  staff   128B 23 mai 08:10 ./
drwxr-xr-x  9 anissetiouajni  staff   288B 23 mai 07:54 ../
-rw-r--r--@ 1 anissetiouajni  staff   6,0K 23 mai 08:10 .DS_Store
drwxr-xr-x  7 anissetiouajni  staff   224B 23 mai 08:11 bluegreen-php/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/openshift-manifests$cd ..
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen$cd src/bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$./mvnw quarkus:dev
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< io.project:bluegreen-quarkus >--------------------
[INFO] Building bluegreen-quarkus 1.0.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:3.0.3.Final:dev (default-cli) @ bluegreen-quarkus ---
[INFO] Invoking org.apache.maven.plugins:maven-resources-plugin:2.6:resources @ bluegreen-quarkus
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Invoking io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:generate-code @ bluegreen-quarkus
[INFO] Invoking org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile @ bluegreen-quarkus
[INFO] Changes detected - recompiling the module! :input tree
[INFO] Compiling 1 source file with javac [debug release 17] to target/classes
[INFO] Invoking org.apache.maven.plugins:maven-resources-plugin:2.6:testResources @ bluegreen-quarkus
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/anissetiouajni/vscode-workspace/bluegreen/src/bluegreen-quarkus/src/test/resources
[INFO] Invoking io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:generate-code-tests @ bluegreen-quarkus
[INFO] Invoking org.apache.maven.plugins:maven-compiler-plugin:3.11.0:testCompile @ bluegreen-quarkus
[INFO] No sources to compile
Listening for transport dt_socket at address: 5005
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 08:29:59,989 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 2.429s. Listening on: http://localhost:8080

2023-05-23 08:29:59,996 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 08:29:59,996 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 08:40:39,923 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Restarting quarkus due to changes in ImageResource.class.
2023-05-23 08:40:39,948 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus stopped in 0.023s
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 08:40:40,336 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 0.382s. Listening on: http://localhost:8080

2023-05-23 08:40:40,337 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 08:40:40,338 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 08:40:40,338 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Live reload total time: 1.011s 
2023-05-23 08:42:49,042 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Restarting quarkus due to changes in ImageResource.class.
2023-05-23 08:42:49,051 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus stopped in 0.009s
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 08:42:49,361 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 0.305s. Listening on: http://localhost:8080

2023-05-23 08:42:49,362 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 08:42:49,363 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 08:42:49,363 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Live reload total time: 0.455s 
2023-05-23 08:47:21,948 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Restarting quarkus due to changes in ImageResource.class.
2023-05-23 08:47:21,959 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus stopped in 0.010s
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 08:47:22,361 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 0.396s. Listening on: http://localhost:8080

2023-05-23 08:47:22,362 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 08:47:22,362 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 08:47:22,363 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Live reload total time: 0.545s 
2023-05-23 08:47:39,994 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Restarting quarkus due to changes in ImageResource.class.
2023-05-23 08:47:40,004 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus stopped in 0.009s
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 08:47:40,317 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 0.309s. Listening on: http://localhost:8080

2023-05-23 08:47:40,318 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 08:47:40,321 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 08:47:40,322 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Live reload total time: 0.440s 
2023-05-23 08:50:34,123 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Restarting quarkus due to changes in ImageResource.class.
2023-05-23 08:50:34,133 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus stopped in 0.009s
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 08:50:34,419 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 0.282s. Listening on: http://localhost:8080

2023-05-23 08:50:34,420 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 08:50:34,420 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 08:50:34,421 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Live reload total time: 0.416s 
2023-05-23 08:50:40,029 INFO  [io.quarkus] (Shutdown thread) bluegreen-quarkus stopped in 0.011s


--
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  20:47 min
[INFO] Finished at: 2023-05-23T08:50:40+01:00
[INFO] ------------------------------------------------------------------------
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$export COLOR=green
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$./mvnw quarkus:dev
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< io.project:bluegreen-quarkus >--------------------
[INFO] Building bluegreen-quarkus 1.0.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:3.0.3.Final:dev (default-cli) @ bluegreen-quarkus ---
[INFO] Invoking org.apache.maven.plugins:maven-resources-plugin:2.6:resources @ bluegreen-quarkus
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Invoking io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:generate-code @ bluegreen-quarkus
[INFO] Invoking org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile @ bluegreen-quarkus
[INFO] Nothing to compile - all classes are up to date
[INFO] Invoking org.apache.maven.plugins:maven-resources-plugin:2.6:testResources @ bluegreen-quarkus
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/anissetiouajni/vscode-workspace/bluegreen/src/bluegreen-quarkus/src/test/resources
[INFO] Invoking io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:generate-code-tests @ bluegreen-quarkus
[INFO] Invoking org.apache.maven.plugins:maven-compiler-plugin:3.11.0:testCompile @ bluegreen-quarkus
[INFO] No sources to compile
Listening for transport dt_socket at address: 5005
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 08:51:03,500 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 2.397s. Listening on: http://localhost:8080

2023-05-23 08:51:03,506 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 08:51:03,507 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 08:55:55,837 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Restarting quarkus due to changes in ColorResource.class.
2023-05-23 08:55:55,858 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus stopped in 0.020s
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 08:55:56,174 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 0.310s. Listening on: http://localhost:8080

2023-05-23 08:55:56,175 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 08:55:56,175 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 08:55:56,176 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Live reload total time: 0.877s 
2023-05-23 09:00:55,386 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Restarting quarkus due to changes in ColorResource.class, HandlerResource.class.
2023-05-23 09:00:55,402 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus stopped in 0.014s
2023-05-23 09:00:55,570 ERROR [io.qua.dep.dev.IsolatedDevModeMain] (vert.x-worker-thread-1) Failed to start quarkus [Error Occurred After Shutdown]: java.lang.RuntimeException: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
	[error]: Build step io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor#setupEndpoints threw an exception: io.quarkus.deployment.configuration.ConfigurationError: GET / is declared by :
io.project.resources.ColorResource#getColor consumes *, produces text/plain;charset=UTF-8
io.project.resources.HandlerResource#getHostname consumes *, produces text/plain;charset=UTF-8

	at io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor.checkForDuplicateEndpoint(ResteasyReactiveProcessor.java:1315)
	at io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor.setupEndpoints(ResteasyReactiveProcessor.java:657)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:909)
	at io.quarkus.builder.BuildContext.run(BuildContext.java:282)
	at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at java.base/java.lang.Thread.run(Thread.java:833)
	at org.jboss.threads.JBossThread.run(JBossThread.java:501)

	at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment(AugmentActionImpl.java:335)
	at io.quarkus.runner.bootstrap.AugmentActionImpl.reloadExistingApplication(AugmentActionImpl.java:265)
	at io.quarkus.runner.bootstrap.AugmentActionImpl.reloadExistingApplication(AugmentActionImpl.java:60)
	at io.quarkus.deployment.dev.IsolatedDevModeMain.restartApp(IsolatedDevModeMain.java:220)
	at io.quarkus.deployment.dev.IsolatedDevModeMain.restartCallback(IsolatedDevModeMain.java:203)
	at io.quarkus.deployment.dev.RuntimeUpdatesProcessor.doScan(RuntimeUpdatesProcessor.java:543)
	at io.quarkus.deployment.dev.RuntimeUpdatesProcessor.doScan(RuntimeUpdatesProcessor.java:441)
	at io.quarkus.vertx.http.runtime.devmode.VertxHttpHotReplacementSetup$4.handle(VertxHttpHotReplacementSetup.java:152)
	at io.quarkus.vertx.http.runtime.devmode.VertxHttpHotReplacementSetup$4.handle(VertxHttpHotReplacementSetup.java:139)
	at io.vertx.core.impl.ContextBase.lambda$null$0(ContextBase.java:137)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:264)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$1(ContextBase.java:135)
	at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
	[error]: Build step io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor#setupEndpoints threw an exception: io.quarkus.deployment.configuration.ConfigurationError: GET / is declared by :
io.project.resources.ColorResource#getColor consumes *, produces text/plain;charset=UTF-8
io.project.resources.HandlerResource#getHostname consumes *, produces text/plain;charset=UTF-8

	at io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor.checkForDuplicateEndpoint(ResteasyReactiveProcessor.java:1315)
	at io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor.setupEndpoints(ResteasyReactiveProcessor.java:657)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:909)
	at io.quarkus.builder.BuildContext.run(BuildContext.java:282)
	at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at java.base/java.lang.Thread.run(Thread.java:833)
	at org.jboss.threads.JBossThread.run(JBossThread.java:501)

	at io.quarkus.builder.Execution.run(Execution.java:123)
	at io.quarkus.builder.BuildExecutionBuilder.execute(BuildExecutionBuilder.java:79)
	at io.quarkus.deployment.QuarkusAugmentor.run(QuarkusAugmentor.java:160)
	at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment(AugmentActionImpl.java:331)
	... 18 more
Caused by: io.quarkus.deployment.configuration.ConfigurationError: GET / is declared by :
io.project.resources.ColorResource#getColor consumes *, produces text/plain;charset=UTF-8
io.project.resources.HandlerResource#getHostname consumes *, produces text/plain;charset=UTF-8

	at io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor.checkForDuplicateEndpoint(ResteasyReactiveProcessor.java:1315)
	at io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor.setupEndpoints(ResteasyReactiveProcessor.java:657)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:909)
	at io.quarkus.builder.BuildContext.run(BuildContext.java:282)
	at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at java.base/java.lang.Thread.run(Thread.java:833)
	at org.jboss.threads.JBossThread.run(JBossThread.java:501)


2023-05-23 09:00:55,580 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Live reload total time: 0.388s 
2023-05-23 09:01:39,475 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Restarting quarkus due to changes in HandlerResource.class, ColorResource.class.
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2023-05-23 09:01:39,737 INFO  [io.quarkus] (Quarkus Main Thread) bluegreen-quarkus 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.0.3.Final) started in 0.261s. Listening on: http://localhost:8080

2023-05-23 09:01:39,737 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2023-05-23 09:01:39,738 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, resteasy-reactive, resteasy-reactive-jackson, smallrye-context-propagation, vertx]
2023-05-23 09:01:39,739 INFO  [io.qua.dep.dev.RuntimeUpdatesProcessor] (vert.x-worker-thread-1) Live reload total time: 0.380s 
2023-05-23 09:02:07,832 INFO  [io.quarkus] (Shutdown thread) bluegreen-quarkus stopped in 0.013s

--

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11:11 min
[INFO] Finished at: 2023-05-23T09:02:08+01:00
[INFO] ------------------------------------------------------------------------
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src/bluegreen-quarkus$cd ..
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$tree
.
├── bluegreen-php
│   ├── README.md
│   ├── color.php
│   ├── image.php
│   └── index.php
└── bluegreen-quarkus
    ├── README.md
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src
    │   └── main
    │       ├── docker
    │       │   ├── Dockerfile.jvm
    │       │   ├── Dockerfile.legacy-jar
    │       │   ├── Dockerfile.native
    │       │   └── Dockerfile.native-micro
    │       ├── java
    │       │   └── io
    │       │       └── project
    │       │           └── resources
    │       │               ├── ColorResource.java
    │       │               ├── HandlerResource.java
    │       │               └── ImageResource.java
    │       └── resources
    │           └── application.properties
    └── target
        ├── build-metrics.json
        ├── classes
        │   ├── META-INF
        │   │   ├── MANIFEST.MF
        │   │   └── maven
        │   │       └── io.project
        │   │           └── bluegreen-quarkus
        │   │               ├── pom.properties
        │   │               └── pom.xml
        │   ├── application.properties
        │   └── io
        │       └── project
        │           └── resources
        │               ├── ColorResource.class
        │               ├── HandlerResource.class
        │               └── ImageResource.class
        ├── generated-sources
        │   └── annotations
        ├── maven-status
        │   └── maven-compiler-plugin
        │       └── compile
        │           └── null
        │               ├── createdFiles.lst
        │               └── inputFiles.lst
        ├── quarkus
        │   └── bootstrap
        └── test-classes

28 directories, 26 files
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$ll
total 16
drwxr-xr-x   5 anissetiouajni  staff   160B 23 mai 08:05 ./
drwxr-xr-x   9 anissetiouajni  staff   288B 23 mai 07:54 ../
-rw-r--r--@  1 anissetiouajni  staff   6,0K 23 mai 07:54 .DS_Store
drwxr-xr-x   6 anissetiouajni  staff   192B 20 avr 13:31 bluegreen-php/
drwxr-xr-x  14 anissetiouajni  staff   448B 23 mai 08:11 bluegreen-quarkus/
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$git add bluegreen-quarkus/*
Les chemins suivants sont ignorés par un de vos fichiers .gitignore :
src/bluegreen-quarkus/target
astuce: Utilisez -f si vous voulez vraiment les ajouter.
astuce: Éliminez ce message en lançant
astuce: "git config advice.addIgnoredFile false"
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$git status
Sur la branche main
Votre branche est à jour avec 'origin/main'.

Modifications qui seront validées :
  (utilisez "git restore --staged <fichier>..." pour désindexer)
	nouveau fichier : bluegreen-quarkus/README.md
	nouveau fichier : bluegreen-quarkus/mvnw
	nouveau fichier : bluegreen-quarkus/mvnw.cmd
	nouveau fichier : bluegreen-quarkus/pom.xml
	nouveau fichier : bluegreen-quarkus/src/main/docker/Dockerfile.jvm
	nouveau fichier : bluegreen-quarkus/src/main/docker/Dockerfile.legacy-jar
	nouveau fichier : bluegreen-quarkus/src/main/docker/Dockerfile.native
	nouveau fichier : bluegreen-quarkus/src/main/docker/Dockerfile.native-micro
	nouveau fichier : bluegreen-quarkus/src/main/java/io/project/resources/ColorResource.java
	nouveau fichier : bluegreen-quarkus/src/main/java/io/project/resources/HandlerResource.java
	nouveau fichier : bluegreen-quarkus/src/main/java/io/project/resources/ImageResource.java
	nouveau fichier : bluegreen-quarkus/src/main/resources/application.properties

Modifications qui ne seront pas validées :
  (utilisez "git add <fichier>..." pour mettre à jour ce qui sera validé)
  (utilisez "git restore <fichier>..." pour annuler les modifications dans le répertoire de travail)
	modifié :         bluegreen-php/README.md
	modifié :         bluegreen-php/color.php

Fichiers non suivis:
  (utilisez "git add <fichier>..." pour inclure dans ce qui sera validé)
	bluegreen-quarkus/.dockerignore
	bluegreen-quarkus/.gitignore
	bluegreen-quarkus/.mvn/

anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$git add  bluegreen-php/color.php
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$git commit -m "bluegreen app based on Quarkus framework"
[main 34b0a30] bluegreen app based on Quarkus framework
 13 files changed, 990 insertions(+), 1 deletion(-)
 create mode 100644 src/bluegreen-quarkus/README.md
 create mode 100755 src/bluegreen-quarkus/mvnw
 create mode 100644 src/bluegreen-quarkus/mvnw.cmd
 create mode 100644 src/bluegreen-quarkus/pom.xml
 create mode 100644 src/bluegreen-quarkus/src/main/docker/Dockerfile.jvm
 create mode 100644 src/bluegreen-quarkus/src/main/docker/Dockerfile.legacy-jar
 create mode 100644 src/bluegreen-quarkus/src/main/docker/Dockerfile.native
 create mode 100644 src/bluegreen-quarkus/src/main/docker/Dockerfile.native-micro
 create mode 100644 src/bluegreen-quarkus/src/main/java/io/project/resources/ColorResource.java
 create mode 100644 src/bluegreen-quarkus/src/main/java/io/project/resources/HandlerResource.java
 create mode 100644 src/bluegreen-quarkus/src/main/java/io/project/resources/ImageResource.java
 create mode 100644 src/bluegreen-quarkus/src/main/resources/application.properties
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$git push
Énumération des objets: 29, fait.
Décompte des objets: 100% (29/29), fait.
Compression par delta en utilisant jusqu'à 12 fils d'exécution
Compression des objets: 100% (20/20), fait.
Écriture des objets: 100% (25/25), 12.48 Kio | 3.12 Mio/s, fait.
Total 25 (delta 5), réutilisés 0 (delta 0), réutilisés du pack 0
remote: Resolving deltas: 100% (5/5), completed with 3 local objects.
To github.com:atiouajni/bluegreen.git
   23c1976..34b0a30  main -> main
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$git restore ../openshift-manifests/bluegreen-php/bluegreen-php-buildconfig.yaml
(reverse-i-search)`mvn ': mvn io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create  -DprojectGroupId=io.project  -DprojectArtifactId=bluegreen-quarkus  -Dextensions='resteasy-reactive-jackson'  -DnoCode
anissetiouajni@atiouajn-mac:~/vscode-workspace/bluegreen/src$cd /tmp
anissetiouajni@atiouajn-mac:/tmp$mvn io.quarkus.platform:quarkus-maven-plugin:3.0.3.Final:create  -DprojectGroupId=io.project  -DprojectArtifactId=bluegreen-quarkus  -Dextensions='resteasy-reactive-jackson'  -DnoCode
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:3.0.3.Final:create (default-cli) @ standalone-pom ---
[INFO] -----------
[INFO] selected extensions: 
- io.quarkus:quarkus-resteasy-reactive-jackson

[INFO] 
applying codestarts...
[INFO] 📚 java
🔨 maven
📦 quarkus
📝 config-properties
🔧 dockerfiles
🔧 maven-wrapper
[INFO] 
-----------
[SUCCESS] ✅  quarkus project has been successfully generated in:
--> /private/tmp/bluegreen-quarkus
-----------
[INFO] 
[INFO] ========================================================================================
[INFO] Your new application has been created in /private/tmp/bluegreen-quarkus
[INFO] Navigate into this directory and launch your application with mvn quarkus:dev
[INFO] Your application will be accessible on http://localhost:8080
[INFO] ========================================================================================
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.760 s
[INFO] Finished at: 2023-05-23T09:05:42+01:00
[INFO] ------------------------------------------------------------------------
anissetiouajni@atiouajn-mac:/tmp$cd bluegreen
bluegreen/         bluegreen-quarkus/ 
anissetiouajni@atiouajn-mac:/tmp$cd bluegreen-quarkus/
anissetiouajni@atiouajn-mac:/tmp/bluegreen-quarkus$ll
total 72
drwxr-xr-x  10 anissetiouajni  wheel   320B 23 mai 09:05 ./
drwxrwxrwt  11 root            wheel   352B 23 mai 09:05 ../
-rw-r--r--   1 anissetiouajni  wheel    75B 23 mai 09:05 .dockerignore
-rw-r--r--   1 anissetiouajni  wheel   396B 23 mai 09:05 .gitignore
drwxr-xr-x   3 anissetiouajni  wheel    96B 23 mai 09:05 .mvn/
-rw-r--r--   1 anissetiouajni  wheel   1,6K 23 mai 09:05 README.md
-rwxr-xr-x   1 anissetiouajni  wheel    11K 23 mai 09:05 mvnw*
-rw-r--r--   1 anissetiouajni  wheel   7,4K 23 mai 09:05 mvnw.cmd
-rw-r--r--   1 anissetiouajni  wheel   4,0K 23 mai 09:05 pom.xml
drwxr-xr-x   3 anissetiouajni  wheel    96B 23 mai 09:05 src/
anissetiouajni@atiouajn-mac:/tmp/bluegreen-quarkus$vi README.md 

# bluegreen-quarkus

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/bluegreen-quarkus-1.0.0-SNAPSHOT-runner`

"README.md" 51L, 1643B
