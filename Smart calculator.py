response=['Welcome to smart calculator','My name is Regal',
          'Thanks for enjoy with me ','Sorry ,this is  beyond my ability']
  

def extract_from_text(text):
    l=[]
    for t in text.split(' '):
        try:
            l.append(float(t))
        except ValueError:
            pass
    return l
  
def lcm(a,b):
    L=a if a>b else b
    while L<=a*b:
        if L%a==0 and L%b==0:
            return L
        L+=1
  
def hcf(a,b):
    H=a if a<b else b
    while H>=1:
        if a%H==0 and b%H==0:
            return H
        H-=1
  
def add(a,b):
    return a+b
  
def sub(a,b):
    return a-b
  
def mul(a,b):
    return a*b
  
def div(a,b):
    return a/b
  
def mod(a,b):
    return a%b
  

def end():
    print(response[2])
    input('press enter key to exit')
    exit()
   
def myname():
    print(response[1])
def sorry():
    print(response[3])
   
operations={'ADD':add,'PLUS':add,'SUM':add,'ADDITION':add,"+":add,
            'SUB':sub,'SUBTRACT':sub, 'MINUS':sub,"-":sub,
            'DIFFERENCE':sub,'LCM':lcm,'HCF':hcf,
            'PRODUCT':mul, 'MULTIPLY':mul,'MULTIPLICATION':mul,
            'DIVISION':div,'MOD':mod,'REMANDER'
            :mod,'MODULAS':mod}
  
commands={'NAME':myname,'EXIT':end,'END':end,'CLOSE':end}
           
print('--------------'+response[0]+'------------')
print('--------------'+response[1]+'--------------------')
   
   
while True:
    print()
    text=input('enter your text:  ')
    for word in text.split(' '):
        if word.upper() in operations.keys():
            try:
                l = extract_from_text(text)
                r = operations[word.upper()] (l[0],l[1])
                print(r)
            except:
                print('something went wrong going plz enter again !!')
            finally:
                      break
        elif word.upper() in commands.keys():
                      commands[word.upper()]()
                      break
    else:         
        sorry()
