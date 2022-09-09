package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("Uno_App_Xam_UWP00.Droid.Application, Uno_App_Xam_UWP00.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc648d4fc99ef6bdf1cc.Application.class, crc648d4fc99ef6bdf1cc.Application.__md_methods);
		mono.android.Runtime.register ("Windows.UI.Xaml.NativeApplication, Uno.UI, Version=255.255.255.255, Culture=neutral, PublicKeyToken=null", crc64122dcf5ad656876d.NativeApplication.class, crc64122dcf5ad656876d.NativeApplication.__md_methods);
		
	}
}
