# from bs4 import BeautifulSoup
# from urllib import request

# target =request.urlopen("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108")

# soup=BeautifulSoup(target,"html.parser")



# for i in soup.select("location"):
#     print("도시 :", i.select_one("city").string)
#     print("날씨 :", i.select_one("wf").string)
#     print("최저기온 :", i.select_one("tmn").string)
#     print("최고기온 :", i.select_one("tmx").string)
from bs4 import BeautifulSoup
from urllib import request

target =request.urlopen("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108")

soup=BeautifulSoup(target,"html.parser")

ds=[]

for i in soup.select("location"):
    a=i.select_one("city").string
    if a =="대전" or a=="세종":
        print("도시 :", i.select_one("city").string)
        print("날씨 :", i.select_one("wf").string)
        print("최저기온 :", i.select_one("tmn").string)
        print("최고기온 :", i.select_one("tmx").string)
        ds.append({"도시":i.select_one("city").string,
                    "날씨":i.select_one("wf").string,
                    "최고기온":i.select_one("tmx").string,
                    "최저기온":i.select_one("tmn").string})
print(ds)
    

