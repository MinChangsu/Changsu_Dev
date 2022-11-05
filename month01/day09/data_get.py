from bs4 import BeautifulSoup
import requests

url="https://finance.naver.com/"
response=requests.get(url)
code=response.text

soup=BeautifulSoup(code,"html.parser")
a=soup.select_one("tr.down>td").text
print(a)
