package crc648d4fc99ef6bdf1cc;


public class MainActivity
	extends crc64122dcf5ad656876d.ApplicationActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Uno_App_Xam_UWP00.Droid.MainActivity, Uno_App_Xam_UWP00.Droid", MainActivity.class, __md_methods);
	}


	public MainActivity ()
	{
		super ();
		if (getClass () == MainActivity.class) {
			mono.android.TypeManager.Activate ("Uno_App_Xam_UWP00.Droid.MainActivity, Uno_App_Xam_UWP00.Droid", "", this, new java.lang.Object[] {  });
		}
	}


	public MainActivity (int p0)
	{
		super (p0);
		if (getClass () == MainActivity.class) {
			mono.android.TypeManager.Activate ("Uno_App_Xam_UWP00.Droid.MainActivity, Uno_App_Xam_UWP00.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
		}
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
