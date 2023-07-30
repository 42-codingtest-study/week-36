n = list(map(int, list(input())))

if len(n) == 1:
    print('◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!')

else:
    check = int(n[0]) - int(n[1])#3
    for i in range(len(n)-1) :
        if n[i] - n[i+1] != check :
            print('흥칫뿡!! <(￣ ﹌ ￣)>')        
            break

    else : 
        print('◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!')