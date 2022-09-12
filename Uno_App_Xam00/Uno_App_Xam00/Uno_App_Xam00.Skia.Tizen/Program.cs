using Tizen.Applications;
using Uno.UI.Runtime.Skia;

namespace Uno_App_Xam00.Skia.Tizen
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var host = new TizenHost(() => new Uno_App_Xam00.App());
            host.Run();
        }
    }
}
