import requests
url =' https://www.worldometers.info/coronavirus'
result = requests.get(url)
import bs4
soup = bs4.BeautifulSoup(result.text, 'lxml')
cases = soup.find_all('div', class_ = 'maincounter-number')
data = []
for i in cases:
    span = i .find('span')
    data.append(span.string)
import pandas as pd
df = pd.DataFrame({'CoronaData': data})
df.index = ['TotalCases', 'Deaths', 'Recovered']
df
df.to_csv('Corona_Data.csv')

