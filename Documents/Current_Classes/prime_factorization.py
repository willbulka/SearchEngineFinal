#############################################################
def is_prime2(x):                                           #
    if (x<1):                                               #
        return False                                        #
    elif(x==1):                                             #
        return False                                        #
    elif( x%2==0 ):                                         #
        if( x==2 ):                                         #
            return True                                     #
        return False                                        #
    elif( x%3==0 ):                                         #
        if( x==3 ):                                         #
            return True                                     #
        return False                                        #
    elif( x%5==0 ):                                         #
        if( x==5 ):                                         #
            return True                                     #
        return False                                        #
    elif( x%7==0 ):                                         #
        if( x==7 ):                                         #
            return True                                     #
        return False                                        #
    for i in range(11,int(x**.5)):                          #
        if( x%i==0 ):                                       #
            return False                                    #
        i+=2                                                #
    return True                                             #
#############################################################

#############################################################
def pool_of_primes(x,aList):                                #
    #aList should be originally empty                       #
    if (x <= 0):                                            #
        if (x==0):                                          #
            #x cannot be divided anything definitely        #
            return False                                    #
        else:                                               #
            x = int((x/(-1)))                               #
            aList.append(-1)                                #
            return pool_of_primes(x,aList)                  #
    if(len(aList)==0):                                      #
        aList.append(1)                                     #
    if (is_prime2(x)==True):                                #
        aList.append(x)                                     # 
        return aList                                        #
    else:                                                   #
        if (x%2 == 0):                                      #
            x = int(x/2)                                    #
            aList.append(x)                                 #
            return pool_of_primes(x,aList)                  #
        for i in range(3,int(x**.5)):                       #
            if(x%i==0):                                     #
                x = int(x/i)                                #
                aList.append(i)                             #
                return pool_of_primes(x,aList)              #
            i+=2                                            #
#############################################################

#########################################################################
def combinations(aList):                                                #
      length            =     len(aList)                                #
      s                 =     ""                                        #
      canidates         =     0                                         #
      nList             =     []                                        #
      finalForm         =     []                                        #
      x                 =     True                                      #
      y                 =     1                                         #
      for i in range(0,length):                                         #
            s           +=    "1"                                       #
            canidates   +=    pow(2,i)                                  #
      #We now have a string for on/off switch of the elements in our    #
      #new list. Canidates is the size of the new list.                 #
      while( canidates != 0 ):                                          #
            y           =     1                                         #
            for i in range(0,length):                                   #
                  if (int(s[i]) == 1):                                  #
                        y     =     y*aList[i]                          #
            if (y != 1):                                                #
                  nList.append(y)                                       #
            canidates   -=    1                                         #
            s           =     ""                                        #
            temp        =     bin(canidates)                            #
            for i in range(2,len(temp)):                                #
                  s     =     s+temp[i]                                 #
            if (len(s) != length):                                      #
                  while( len(s) != length):                             #
                        s     =     '0'+s                               #
      #We now have a list that returns all the combinations.            #
      #But what about any repeats in our set?                           #
      for i in range(0, len(nList)):                                    #
            for j in range(0,len(finalForm)):                           #
                  if( nList[i] == finalForm[j]):                        #
                        x     =     False                               #
                  j+=1                                                  #
            if (x==True):                                               #
                  finalForm.append(nList[i])                            #
            x     =     True                                            #
            i     +=    1                                               #
      return finalForm                                                  #
#########################################################################

def main():
    a = pool_of_primes(99,[])
    print("Pool of primes for 99 are:\n")
    print("\t"+str(a))
    print("\n\nAll possible integers formed by these are: \n")
    lst = combinations(a)
    print("\t"+str(lst))
    print("\n\n\n")
    ##########3################################################
    a = pool_of_primes(9651656569,[])
    print("Pool of primes for 9651656569 are:\n")
    print("\t"+str(a))
    print("\n\nAll possible integers formed by these are: \n")
    lst = combinations(a)
    print("\t"+str(lst))
    print("\n\n\n")
    ##########3################################################
    a = pool_of_primes(916812133159894654562,[])
    print("Pool of primes for 916812133159894654562 are:\n")
    print("\t"+str(a))
    print("\n\nAll possible integers formed by these are: \n")
    lst = combinations(a)
    print("\t"+str(lst))
    print("\n\n\n")

main()
                
    
