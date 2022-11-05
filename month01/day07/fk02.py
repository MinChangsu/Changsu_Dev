from bs4 import BeautifulSoup
from urllib import request
from flask import Flask

app=Flask(__name__)
@app.route("/")

def hello():
    #전국 날씨 읽기
    target=request.urlopen("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108")
    #beautifulsoup이용해 웹페이지 분석
    soup=BeautifulSoup(target,"html.parser")
    #location 태그 찾기
    out=""
    for i in soup.select("location"):
        out +="<h3>{}<h3>".format(i.select_one("city").string)
        out +="날씨 :{}<br/>".format(i.select_one("wf").string)
        out +="최저/최고 기온 :{}/{}".format(i.select_one("tmn").string,i.select_one("tmx").string)
        out+= "<hr/>"
    return out


