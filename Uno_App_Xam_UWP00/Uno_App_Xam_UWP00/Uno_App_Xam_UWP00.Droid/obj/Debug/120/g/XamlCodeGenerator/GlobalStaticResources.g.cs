// <autogenerated />
#pragma warning disable 618  // Ignore obsolete members warnings
#pragma warning disable 105  // Ignore duplicate namespaces
#pragma warning disable 1591 // Ignore missing XML comment warnings
using System;
using System.Linq;
using System.Collections.Generic;
using Uno.Extensions;
using Uno;
using System.Diagnostics;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Documents;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Media.Animation;
using Uno_App_Xam_UWP00.Droid;

#if __WASM__
#error invalid internal source generator state. The __WASM__ DefineConstant was not propagated properly.
#endif
namespace Uno_App_Xam_UWP00.Droid
{
	/// <summary>
	/// Contains all the static resources defined for the application
	/// </summary>
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV0056", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV0058", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV1003", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV0085", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV2001", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV2003", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV2004", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("nventive.Usage", "NV2005", Justification="Generated code")]
	[global::System.Diagnostics.CodeAnalysis.SuppressMessage("dotnet", "CA1001", Justification="Generated code")]
	public sealed partial class GlobalStaticResources
	{
		static bool _initialized;
		private static bool _stylesRegistered;
		private static bool _dictionariesRegistered;
		internal static global::Uno.UI.Xaml.XamlParseContext __ParseContext_ {get; } = new global::Uno.UI.Xaml.XamlParseContext()
		{
			AssemblyName = "Uno_App_Xam_UWP00.Droid",
		}
		;

		static GlobalStaticResources()
		{
			Initialize();
		}
		public static void Initialize()
		{
			if (!_initialized)
			{
				_initialized = true;
				global::Uno.UI.GlobalStaticResources.Initialize();
				global::Uno.UI.Toolkit.GlobalStaticResources.Initialize();
				global::Uno.UI.GlobalStaticResources.RegisterDefaultStyles();
				global::Uno.UI.Toolkit.GlobalStaticResources.RegisterDefaultStyles();
				global::Uno.UI.GlobalStaticResources.RegisterResourceDictionariesBySource();
				global::Uno.UI.Toolkit.GlobalStaticResources.RegisterResourceDictionariesBySource();
			}
		}
		public static void RegisterDefaultStyles()
		{
			if(!_stylesRegistered)
			{
				_stylesRegistered = true;
				RegisterDefaultStyles_App_95f37425775c09c7219c2c3614ef17e5();
				RegisterDefaultStyles_MainPage_e7a0808ff24a23feef3957f095a97b7e();
			}
		}
		// Register ResourceDictionaries using ms-appx:/// syntax, this is called for external resources
		public static void RegisterResourceDictionariesBySource()
		{
			if(!_dictionariesRegistered)
			{
				_dictionariesRegistered = true;
			}
		}
		// Register ResourceDictionaries using ms-resource:/// syntax, this is called for local resources
		internal static void RegisterResourceDictionariesBySourceLocal()
		{
		}
		static partial void RegisterDefaultStyles_App_95f37425775c09c7219c2c3614ef17e5();
		static partial void RegisterDefaultStyles_MainPage_e7a0808ff24a23feef3957f095a97b7e();
		[global::System.Obsolete("This method is provided for binary backward compatibility. It will always return null.")]
		[global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
		public static object FindResource(string name) => null;
		
	}
}
