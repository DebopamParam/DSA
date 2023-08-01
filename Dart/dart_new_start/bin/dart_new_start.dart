import 'package:dart_new_start/src/calculate.dart';

// in the path we don't use projectName/src/dartFile

void main() {
  var a = 29 , b = 54;
  print("Add ${calculateAdd(a, b)}");
  print("Sub ${calculateSub(a, b)}");
  print("Multiply ${calculateMultiply(a, b)}");
  print("Divide ${calculateDivide(a, b)}");
}
