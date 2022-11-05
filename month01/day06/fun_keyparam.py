books=[{
    "제목":"혼공파",
    "가격":18000,
    },
    {"제목":"혼공머",
    "가격":26000},
    {"제목":"혼공자",
    "가격":24000}
]
def ka (book):
    return book["가격"]
print(min(books,key=ka))


