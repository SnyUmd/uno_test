package crc64a5a37c43dff01024;


public class ItemContainerHolder
	extends crc64a5a37c43dff01024.Border
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.ItemContainerHolder, Uno.UI", ItemContainerHolder.class, __md_methods);
	}


	public ItemContainerHolder (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ItemContainerHolder.class) {
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.ItemContainerHolder, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
