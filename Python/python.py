import urllib.request
import random
username = 'USERNAME'
password = 'PASSWORD'
country = 'US'
session = random.random()
entry = ('http://customer-%s-cc-%s:%s@pr.oxylabs.io:7777' %
    (username, country, password))
query = urllib.request.ProxyHandler({
    'http': entry,
    'https': entry,
})
execute = urllib.request.build_opener(query)
print(execute.open('https://ipinfo.io').read())
