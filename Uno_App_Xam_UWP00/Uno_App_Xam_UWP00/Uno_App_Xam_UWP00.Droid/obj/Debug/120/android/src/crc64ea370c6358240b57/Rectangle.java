package crc64ea370c6358240b57;


public class Rectangle
	extends crc64ea370c6358240b57.Shape
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Shapes.Rectangle, Uno.UI", Rectangle.class, __md_methods);
	}


	public Rectangle (android.content.Context p0)
	{
		super (p0);
		if (getClass () == Rectangle.class) {
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Shapes.Rectangle, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
