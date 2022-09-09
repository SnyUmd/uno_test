package crc6424a2f417b49505b9;


public class MainPage
	extends crc6499cc3f8d6dc23bc6.Page
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Uno_Platform_App00.MainPage, Uno_Platform_App00.Mobile", MainPage.class, __md_methods);
	}


	public MainPage (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MainPage.class)
			mono.android.TypeManager.Activate ("Uno_Platform_App00.MainPage, Uno_Platform_App00.Mobile", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
