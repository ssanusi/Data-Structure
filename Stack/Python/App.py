from Stack import Stack
from StringReverser import reverse_string
from Expression import Expression
stack = Stack()
stack.push(10)
stack.push(20)
stack.push(30)
stack.push(40)
print(stack.pop())
print(stack)

name = 'sanusi'
reverse_name = reverse_string(name)
print(reverse_name)


str = '(1 + 2 + 3)'
exp = Expression()
print(exp.is_balanced(str))

