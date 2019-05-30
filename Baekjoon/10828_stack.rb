class Stack
  def initialize
    @stack = []
  end

  def push(data)
    @stack << data
  end

  def pop
    if @stack.empty?
      -1
    else
      value = @stack[@stack.size-1]
      @stack.delete_at(@stack.size-1)
      value
    end
  end

  def size
    @stack.size
  end

  def empty
    @stack.empty? ? 1 : 0
  end

  def top
    if @stack.empty?
      -1
    else
        @stack[@stack.size-1]
    end
  end
end

num = gets
stack = Stack.new

(1..num.to_i).each do
  arr = gets.split()
  el = arr[0]
  if el == "push"
    stack.push(arr[1])
  elsif el == "pop"
    puts stack.pop
  elsif el == "size"
    puts stack.size
  elsif el == "empty"
    puts stack.empty
  elsif el == "top"
    puts stack.top
  end
end