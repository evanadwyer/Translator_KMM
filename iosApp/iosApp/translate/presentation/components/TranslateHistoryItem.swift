//
//  TranslateHistoryItem.swift
//  iosApp
//
//  Created by Evan Dwyer on 4/23/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct TranslateHistoryItem: View {
    let item: UiHistoryItem
    let onClick: () -> Void
    
    var body: some View {
        Button(action: onClick) {
            VStack(alignment: .leading) {
                HStack {
                    SmallLanguageIcon(language: item.fromLanguage)
                        .padding(.trailing)
                    Text(item.fromText)
                        .foregroundColor(.lightBlue)
                        .font(.body)
                }
                .padding(.bottom)
                .frame(maxWidth: .infinity, alignment: .leading)
                HStack {
                    SmallLanguageIcon(language: item.toLanguage)
                        .padding(.trailing)
                    Text(item.toText)
                        .foregroundColor(.onSurface)
                        .font(.body.weight(.semibold))
                }
                .frame(maxWidth: .infinity, alignment: .leading)
            }
            .frame(maxWidth: .infinity)
            .padding()
            .gradientSurface()
            .cornerRadius(15)
            .shadow(radius: 4)
        }
    }
}

#Preview {
    TranslateHistoryItem(item: UiHistoryItem(id: 0, fromText: "hello", toText: "hallo", fromLanguage: UiLanguage(language: .english, imageName: "english"), toLanguage: UiLanguage(language: .german, imageName: "german")), onClick: {})
}
