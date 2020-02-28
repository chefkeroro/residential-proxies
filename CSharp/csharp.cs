using System;
using System.Net;

class Example
{
    static void Main()
    {
        var client = new WebClient();
        client.Proxy = new WebProxy("pr.oxylabs.io:7777");
        client.Proxy.Credentials = new NetworkCredential("customer-USERNAME-cc-DE", "PASSWORD");
        Console.WriteLine(client.DownloadString("https://ipinfo.io"));
    }
}
