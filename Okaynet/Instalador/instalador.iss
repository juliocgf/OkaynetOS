; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{B6BE9652-3342-4816-889B-2FD093F1A84D}
AppName=Okaynet OS Manager
AppVersion=1.1
;AppVerName=Okaynet OS Manager 1.1
AppPublisher=Okaynet Informática LTDA
AppPublisherURL=http://www.okaynet.com.br
AppSupportURL=http://www.okaynet.com.br
AppUpdatesURL=http://www.okaynet.com.br
DefaultDirName=C:/okaynet
DisableDirPage=yes
DefaultGroupName=Okaynet OS Manager
OutputDir=C:\Users\Erick\Desktop
OutputBaseFilename=setup
Compression=lzma
SolidCompression=yes


[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"
Name: "brazilianportuguese"; MessagesFile: "compiler:Languages\BrazilianPortuguese.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "C:\Users\Erick\Desktop\Okaynet.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Erick\Desktop\Okaynet.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Erick\Desktop\okaynet\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "C:\Users\Erick\Desktop\faststone.ico"; DestDir: "{app}"; Flags: ignoreversion
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{group}\Okaynet OS Manager"; Filename: "{app}\Okaynet.jar"
Name: "{commondesktop}\Okaynet OS Manager"; Filename: "{app}\Okaynet.jar"; Tasks: desktopicon; IconFilename: {app}\faststone.ico;

[Run]
Filename: "{app}\Okaynet.jar"; Description: "{cm:LaunchProgram,Okaynet OS Manager}"; Flags: shellexec postinstall skipifsilent

