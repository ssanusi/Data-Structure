from Stack import Stack

def reverse_string(value):
    if value is None:
        return ValueError('Input Cannot be Empty')
    stack = Stack()
    for item in value:
        stack.push(item)
    reverse = ''
    while not stack.isEmpty():
        reverse += stack.pop()
    return reverse
