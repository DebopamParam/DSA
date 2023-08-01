import 'package:demo/demo.dart' as demo;

void main(List<String> arguments) {
  print('Hello world: ${demo.calculate()}!\n'
  'Args Sum: ${arguments.fold<int>(0,(previousValue, element) => previousValue + int.parse(element)) }');
  
}