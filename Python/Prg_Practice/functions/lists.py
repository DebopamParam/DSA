s = "Hello How are you?"
msgs = s.split()
sent = []
x = msgs[:]


def send_messages(msgs: list) -> None:
    while msgs:
        sent_msg = msgs.pop(0)
        sent.append(sent_msg)


send_messages(x)
print(msgs)
print(x)
print(sent)
