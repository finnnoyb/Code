
Hostname: GruppeB2b / GruppeB4
Benutzer: gruppeb
Standardpasswort: Vulcan


Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows

PS C:\Users\itzli> ping

Usage: ping [-t] [-a] [-n count] [-l size] [-f] [-i TTL] [-v TOS]
            [-r count] [-s count] [[-j host-list] | [-k host-list]]
            [-w timeout] [-R] [-S srcaddr] [-c compartment] [-p]
            [-4] [-6] target_name

Options:
    -t             Ping the specified host until stopped.
                   To see statistics and continue - type Control-Break;
                   To stop - type Control-C.
    -a             Resolve addresses to hostnames.
    -n count       Number of echo requests to send.
    -l size        Send buffer size.
    -f             Set Don't Fragment flag in packet (IPv4-only).
    -i TTL         Time To Live.
    -v TOS         Type Of Service (IPv4-only. This setting has been deprecated
                   and has no effect on the type of service field in the IP
                   Header).
    -r count       Record route for count hops (IPv4-only).
    -s count       Timestamp for count hops (IPv4-only).
    -j host-list   Loose source route along host-list (IPv4-only).
    -k host-list   Strict source route along host-list (IPv4-only).
    -w timeout     Timeout in milliseconds to wait for each reply.
    -R             Use routing header to test reverse route also (IPv6-only).
                   Per RFC 5095 the use of this routing header has been
                   deprecated. Some systems may drop echo requests if
                   this header is used.
    -S srcaddr     Source address to use.
    -c compartment Routing compartment identifier.
    -p             Ping a Hyper-V Network Virtualization provider address.
    -4             Force using IPv4.
    -6             Force using IPv6.


PS C:\Users\itzli> ping raspberrypi

Pinging raspberrypi.fritz.box [192.168.188.197] with 32 bytes of data:
Reply from 192.168.188.197: bytes=32 time<1ms TTL=64
Reply from 192.168.188.197: bytes=32 time<1ms TTL=64
Reply from 192.168.188.197: bytes=32 time<1ms TTL=64
Reply from 192.168.188.197: bytes=32 time<1ms TTL=64

Ping statistics for 192.168.188.197:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms
PS C:\Users\itzli> ping GruppeB4.local

Pinging GruppeB4.local [192.168.188.171] with 32 bytes of data:
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64

Ping statistics for 192.168.188.171:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms
PS C:\Users\itzli> ping GruppeB4.local

Pinging GruppeB4.local [192.168.188.171] with 32 bytes of data:
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64

Ping statistics for 192.168.188.171:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms
PS C:\Users\itzli> ping GruppeB4.local

Pinging GruppeB4.local [192.168.188.171] with 32 bytes of data:
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64

Ping statistics for 192.168.188.171:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms
PS C:\Users\itzli> ping GruppeB4.local

Pinging GruppeB4.local [192.168.188.171] with 32 bytes of data:
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64

Ping statistics for 192.168.188.171:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms
PS C:\Users\itzli> ping GruppeB4.local

Pinging GruppeB4.local [192.168.188.171] with 32 bytes of data:
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64

Ping statistics for 192.168.188.171:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms
PS C:\Users\itzli> ping GruppeB4.local

Pinging GruppeB4.local [192.168.188.171] with 32 bytes of data:
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64
Reply from 192.168.188.171: bytes=32 time<1ms TTL=64

Ping statistics for 192.168.188.171:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 0ms, Maximum = 0ms, Average = 0ms



oben gibts pi IP 

ipconfig (um an IP zu kommen)




1) ssh-Verbindung zum Pi 
2) sudo apt update
3) sudo apt install iperf3

ssh gruppeb@GrubbeB4.local


settings 

(pi) iperf3 -c <vom pi IP> (-c client)

(laptop) iperf3 -s (-s server) drag drop .exe